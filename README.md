# Furniture Shipping Cost Calculator (Visitor Design Pattern)

## Problem Statement
We will design a shipping cost calculation system for an e-commerce platform that sells furniture such as **chairs, tables, and sofas**.  
The system must calculate shipping fees based on:

- Furniture type
- Size (cubic centimeters)
- Shipping method (flat rate or distance-based)

Instead of placing shipping logic inside furniture classes, the **Visitor Design Pattern** is used.  
This allows shipping algorithms to be separated from furniture objects.

Benefits of this design:

- Avoids tight coupling between furniture data and shipping logic
- Makes it easier to add new shipping strategies
- Follows the **Open/Closed Principle**
- Keeps the furniture class simple while allowing flexible operations

---

## UML Class Diagram
*(Insert UML Diagram here if available)*

---

## Components

### 1. Visitor Interfaces
- **ShippingCalculator** – Handles flat rate shipping.
- **DistanceShipping** – Handles distance-based shipping.

These interfaces define operations that can be performed on furniture objects.

### 2. Visitable Interface
- Represented by **Furniture.java**
- Declares `accept()` methods
- Furniture objects delegate shipping computation to visitors

### 3. Concrete Visitable Class
- **FurnitureItem** (single class for all furniture types)

Fields:
- `furnitureType` (Chair, Table, Sofa)
- `size` (in cubic centimeters)

The `accept()` method allows visitors to process shipping calculations.

### 4. Concrete Visitor Classes

#### FlatRateShipping
- Applies flat shipping fee for small items
- Uses size threshold to determine eligibility
