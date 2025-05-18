# Funcionalidade 1: Planilha de Controle de Compras em Grupo

## 🧩 Visão Geral

Esta funcionalidade permite que usuários logados criem, atualizem e consultem planilhas de controle de compras em grupo integradas ao Google Sheets.
Cada planilha é vinculada ao usuário, deve ser exclusiva pra cada set comprado e armazena dados detalhados sobre itens comprados separados por participante.

---

## ✅ Caso de Uso

**Como** um usuário autenticado,  
**Quero** criar e gerenciar uma planilha de controle de compras em grupo,  
**Para** acompanhar os itens comprados, seus custos e status de pagamento e andamento da ceg.

---

## 📊 Estrutura da Planilha

Cada linha da planilha representa uma entrada de compra e contém as seguintes colunas:

- `Nome do Participante`
- `User do Participante`
- `Item`
- `Valor do Item`
- `Pago Item` (✅/❌)
- `Frete Internacional`
- `Pago Frete` (✅/❌)
- `Taxa de Importação`
- `Pago Taxa` (✅/❌)
- `Envio Nacional` (✅/❌)

---

## 🔁 Funcionalidades

### 1. Criar Planilha
- Geração de uma nova planilha no Google Sheets vinculada ao usuário autenticado.
- A planilha é criada com cabeçalhos definidos.

### 2. Atualizar Planilha
- Permite atualizar os dados da planilha com novas ou modificadas entradas de compra.

### 3. Consultar Planilha
- Recupera os dados da planilha e os transforma em objetos de domínio para consumo.

---

## 🏛️ Arquitetura

A funcionalidade segue o padrão de **Arquitetura Hexagonal (Ports and Adapters)**.


