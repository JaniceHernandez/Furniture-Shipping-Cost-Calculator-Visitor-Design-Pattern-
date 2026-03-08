# Furniture Shipping Cost Calculator (Visitor Design Pattern)

## Problem Statement
We will design a shipping cost calculation system for an e-commerce platform that sells furniture such as **chairs, tables, and sofas**.  
The system must calculate shipping fees based on:

- Furniture type
- Size (cubic centimeters)
- Shipping method (flat rate or distance-based)

To achieve flexibility and avoid tight coupling between furniture classes and shipping logic, we use the **Visitor Design Pattern**.

This design allows:
- Shipping calculations to be handled by visitor classes
- New shipping strategies to be added without modifying furniture classes
- Separation of concerns between objects and operations

---

## UML Class Diagram
*(Insert UML Diagram here if available)*

---

## Components

### 1. Visitor Interface
- Represented by `ShippingCostCalculator.java`.
- Defines the method used to calculate shipping cost.

### 2. Visitable Interface
- Represented by `Furniture.java`.
- Declares the `accept()` method that allows visitors to perform operations on furniture objects.

### 3. Concrete Visitable Classes
These classes implement the `Furniture` interface:
- `Chair`
- `Table`
- `Sofa`

Each class overrides the `accept()` method and passes its size and type to the visitor.

### 4. Concrete Visitor Classes

#### FlatRateShipping
- Applies a **flat shipping fee** for small furniture items.
- Uses a **size threshold** to determine if the flat rate should be applied.

#### DistanceBasedShipping
- Calculates shipping based on **delivery distance** for larger furniture items.
- Uses the formula:  
  `Shipping Cost = Base Fee + (Distance × Rate)`

### 5. Client
- Represented by `FurnitureShop.java`.
- Creates furniture objects and shipping visitors.
- Sends the shipping calculation request using the `accept()` method.

### 6. Context
- The context includes the `Furniture` objects and visitor implementations.
- The system allows different shipping calculations to be applied dynamically to the furniture items.
