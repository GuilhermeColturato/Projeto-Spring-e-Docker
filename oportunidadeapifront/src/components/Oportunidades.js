import { useEffect, useState } from "react";

function Oportunidades() {
  const [oportunidades, setOportunidades] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/oportunidades")
      .then(response => response.json())
      .then(data => setOportunidades(data))
      .catch(error => console.error("Erro ao buscar dados:", error));
  }, []);

  return (
    <div>
      <h2>Oportunidades</h2>
      <ul>
        {oportunidades.map((oportunidade) => (
          <li key={oportunidade.id}>
            {oportunidade.nome} - {oportunidade.descricao}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Oportunidades;
