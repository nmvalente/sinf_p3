## Purchases

**HEADER**

```sql
SELECT dbo.CabecDoc.Id, dbo.CabecDoc.Data, dbo.CabecDoc.DataVencimento,
       dbo.CabecDoc.DataDescarga, dbo.CabecDoc.TipoDoc, dbo.CabecDoc.EntidadeFac,
       dbo.CabecDoc.NomeFac, TotalMerc, dbo.CabecDoc.Moeda, dbo.CabecDoc.RegimeIva
FROM dbo.CabecDoc;
```

| Ours          | PRIMAVERA                   |
|:------:       |:------:                     |
| IdPurchase    | dbo.CabecDoc.Id             |
| DocumentDate  | dbo.CabecDoc.Data           |
| DueDate       | dbo.CabecDoc.DataVencimento |
| ReceptionDate | dbo.CabecDoc.DataDescarga   |
| DocumentType  | dbo.CabecDoc.TipoDoc        |
| SupplierId    | dbo.CabecDoc.EntidadeFac    |
| SupplierName  | dbo.CabecDoc.NomeFac        |
| VAT           | dbo.CabecDoc.RegimeIva      |

**LINES**

```sql
SELECT dbo.Artigo.Artigo, dbo.Artigo.Marca, dbo.Artigo.Modelo, dbo.Artigo.Familia,
       dbo.Familias.Descricao, dbo.Artigo.SubFamilia, dbo.SubFamilias.Descricao
FROM dbo.Artigo
INNER JOIN dbo.Familias ON dbo.Artigo.Familia=dbo.Familias.Familia
INNER JOIN dbo.SubFamilias ON dbo.Artigo.SubFamilia=dbo.SubFamilias.SubFamilia;
```

| Ours                 | PRIMAVERA                 |
|:------:              |:------:                   |
| IdProduct            | dbo.Artigo.Artigo         |
| Brand                | dbo.Artigo.Marca          |
| Model                | dbo.Artigo.Modelo         |
| FamilyId             | dbo.Artigo.Familia        |
| FamilyDescription    | dbo.Familias.Descricao    |
| SubFamilyId          | dbo.Artigo.SubFamilia     |
| SubFamilyDescription | dbo.SubFamilias.Descricao |

**VALUE**

```sql
SELECT dbo.CabecDoc.TotalMerc, dbo.CabecDoc.Moeda
FROM dbo.CabecDoc;
```

| Ours     | PRIMAVERA              |
|:------:  |:------:                |
| Value    | dbo.CabecDoc.TotalMerc |
| Currency | dbo.CabecDoc.Moeda     |

## Receivables

**RECEIBAVLES**

```sql
SELECT dbo.Pendentes.TipoDoc, dbo.Pendentes.DataDoc, dbo.Pendentes.DataVenc,
       dbo.Pendentes.Estado, dbo.Pendentes.Entidade, dbo.Pendentes.TipoEntidade
FROM dbo.Pendentes;
````

| Ours         | PRIMAVERA                  |
|:------:      |:------:                    |
| DocumentType | dbo.Pendentes.TipoDoc      |
| DocumentDate | dbo.Pendentes.DataDoc      |
| DueDate      | dbo.Pendentes.DataVenc     |
| State        | dbo.Pendentes.Estado       |
| Entity       | dbo.Pendentes.Entidade     |
| EntityType   | dbo.Pendentes.TipoEntidade |

**PENDINGVALUE**

```sql
SELECT dbo.Pendentes.ValorPendente, dbo.Pendentes.Moeda
FROM dbo.Pendentes;
````

| Ours     | PRIMAVERA                   |
|:------:  |:------:                     |
| Value    | dbo.Pendentes.ValorPendente |
| Currency | dbo.Pendentes.Moeda         |

## Payables

**PAYABLES**

```sql
SELECT dbo.Pendentes.TipoDoc, dbo.Pendentes.DataDoc, dbo.Pendentes.DataVenc,
       dbo.Pendentes.Estado, dbo.Pendentes.Entidade, dbo.Pendentes.TipoEntidade
FROM dbo.Pendentes;
````

| Ours         | PRIMAVERA                  |
|:------:      |:------:                    |
| DocumentType | dbo.Pendentes.TipoDoc      |
| DocumentDate | dbo.Pendentes.DataDoc      |
| DueDate      | dbo.Pendentes.DataVenc     |
| State        | dbo.Pendentes.Estado       |
| Entity       | dbo.Pendentes.Entidade     |
| EntityType   | dbo.Pendentes.TipoEntidade |


**PENDINGVALUE**

```sql
SELECT dbo.Pendentes.ValorPendente, dbo.Pendentes.Moeda
FROM dbo.Pendentes;
````

| Ours     | PRIMAVERA                   |
|:------:  |:------:                     |
| Value    | dbo.Pendentes.ValorPendente |
| Currency | dbo.Pendentes.Moeda         |
