# 13 - Manipulação de Arquivos

Exemplo de **leitura e escrita em arquivos de texto** em Java, usando as classes
do pacote `java.io`. É uma continuação prática do conteúdo visto na pasta
[`Serialização/`](../Serialização), aplicado a um pequeno cadastro de produtos.

## Conceitos usados

Classes do `java.io` para manipular arquivos:

| Classe | Para que serve |
|--------|----------------|
| `FileWriter` | Escreve caracteres em um arquivo. |
| `BufferedWriter` | Escreve de forma eficiente, usando um buffer (bom para muitos dados). |
| `FileReader` | Lê caracteres de um arquivo. |
| `BufferedReader` | Lê de forma eficiente, usando um buffer; permite ler linha a linha. |

Outros pontos demonstrados:

- **Modo "append"**: `new FileWriter(nome, true)` adiciona ao final do arquivo
  sem apagar o conteúdo já existente.
- **Persistência**: os dados continuam salvos em `produtos.txt` mesmo depois de
  encerrar o programa.
- **Parsing de linha**: cada linha é dividida com `split(";")` e os campos são
  convertidos com `Double.parseDouble` / `Integer.parseInt`.

## Estrutura

```
CadastroProdutos/
├── Produto.java     -> classe modelo (nome, preço, quantidade)
├── Arquivo.java     -> grava e lê produtos do arquivo de texto
└── Principal.java   -> menu interativo (cadastrar, listar, total do estoque)
```

Formato de cada linha gravada em `produtos.txt`:

```
Teclado;120.50;10
Mouse;75.00;25
```

## Como executar

```bash
cd CadastroProdutos
javac *.java
java Principal
```

No menu, use:

- **1** para cadastrar um novo produto (ele é gravado no arquivo);
- **2** para listar tudo o que está salvo no arquivo;
- **3** para ver o valor total do estoque (soma de preço × quantidade);
- **0** para sair.

---

Autor: Guilherme Hermes
