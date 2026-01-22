import { useState } from "react";
import "./App.css";

function App() {
  const [answer, setAnswer] = useState("");

  const sendQuestion = async (question) => {
    const response = await fetch("http://localhost:8080/api/queries", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ question }),
    });

    const data = await response.json();
    setAnswer(data.answer);
  };

  return (
    <div className="app">
      <div className="card">
        <h2>Automated Message Service</h2>

        <div className="button-group">
          <button onClick={() => sendQuestion("who made these service?")}>
            Who made this website?
          </button>

          <button onClick={() => sendQuestion("use of this service")}>
            What services do you provide?
          </button>

          <button onClick={() => sendQuestion("contact details")}>
            Contact
          </button>
        </div>

        <div className="answer-box">
          <strong>Answer:</strong>
          <p>{answer || "Click a button to get a response"}</p>
        </div>
      </div>
    </div>
  );
}

export default App;
