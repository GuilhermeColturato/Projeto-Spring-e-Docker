import Oportunidades from "./components/Oportunidades";
import CadastroOportunidade from "./components/CadastroOportunidade";

function App() {
  return (
    <div className="App">
      <h1>API de Oportunidades</h1>
      <CadastroOportunidade />
      <hr />
      <Oportunidades />
    </div>
  );
}

export default App;
