# DDA-ItauHeader

Uma biblioteca para facilitar a leitura de arquivos DDA-ItauHeader.

O projeto é composto por 5 Tipos de arquivos, sende eles:

<h2>Header arquivo</h2>
 Onde todo Arquivo tem um Header de arquivo que tem o <b>codigoSequnuencialArquivoRetorno</b>como um atributo que nunca será repetido.
<h2>Registro Detalhe Segmento G</h2>
Onde todo arquivo é composto por varios registro do tipo G, os atributos dele são referente ao boleto em si.
O codigo de boleto formado pelo SegmentoG com a concatenação dos atributos (codigoMoedaTitulo,digitoDAC,fatorVencimento,valorImpressoCodigoBarras,campoLivre)

<h2>Registro Detalhe Segmento H</h2>


<h2>Registro Header Lote</h2>

<h2>Registro Trailler Arquivo</h2>

<h2>Registro Trailer Lote</h2>