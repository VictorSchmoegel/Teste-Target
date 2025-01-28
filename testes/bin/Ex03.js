const fs = require("fs");

const faturamentoMensal = JSON.parse(fs.readFileSync("dados.json", "utf-8"));

function calcularFaturamento(dados) {
  const diasComFaturamento = dados.filter((dia) => dia.valor > 0);

  const menorFaturamento = Math.min(...diasComFaturamento.map((dia) => dia.valor));
  const maiorFaturamento = Math.max(...diasComFaturamento.map((dia) => dia.valor));

  const somaFaturamento = diasComFaturamento.reduce((soma, dia) => soma + dia.valor, 0);
  const mediaMensal = somaFaturamento / diasComFaturamento.length;

  const diasAcimaDaMedia = diasComFaturamento.filter((dia) => dia.valor > mediaMensal).length;

  return {
    menorFaturamento,
    maiorFaturamento,
    diasAcimaDaMedia,
  };
}

const resultado = calcularFaturamento(faturamentoMensal);

console.log("Menor faturamento ocorrido no mês:", resultado.menorFaturamento.toFixed(2));
console.log("Maior faturamento ocorrido no mês:", resultado.maiorFaturamento.toFixed(2));
console.log("Número de dias com faturamento acima da média mensal:", resultado.diasAcimaDaMedia);
