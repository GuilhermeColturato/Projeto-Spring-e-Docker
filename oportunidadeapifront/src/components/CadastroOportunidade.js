import { useState } from "react";

function CadastroOportunidade() {
  const [form, setForm] = useState({
    nome: "",
    descricao: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setForm((prev) => ({ ...prev, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    fetch(`${process.env.REACT_APP_API_URL}/api/oportunidades`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(form),
    })
      .then((response) => {
        if (response.ok) {
          alert("Oportunidade cadastrada com sucesso!");
          setForm({ nome: "", descricao: "" }); // Limpar o formulário
        } else {
          alert("Erro ao cadastrar a oportunidade.");
        }
      })
      .catch((error) => {
        console.error("Erro na requisição:", error);
        alert("Erro na comunicação com o servidor.");
      });
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Cadastrar Nova Oportunidade</h2>
      <div>
        <label>Nome: </label>
        <input
          type="text"
          name="nome"
          value={form.nome}
          onChange={handleChange}
          required
        />
      </div>
      <div>
        <label>Descrição: </label>
        <input
          type="text"
          name="descricao"
          value={form.descricao}
          onChange={handleChange}
          required
        />
      </div>
      <button type="submit">Cadastrar</button>
    </form>
  );
}

export default CadastroOportunidade;
