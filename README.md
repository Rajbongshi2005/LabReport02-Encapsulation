# LabReport02-Encapsulation
## 🎯 Objectives
- Understand the concept of **Encapsulation** in Java  
- Learn how **data hiding** is achieved using access modifiers  
- Demonstrate **controlled access** to class data using getter and setter methods  

---

## 📖 Theory
Encapsulation is one of the core principles of Object-Oriented Programming (OOP).  
It refers to binding data members and the methods that operate on them into a single unit (class) while restricting direct access to some of the object's components.

### Advantages of Encapsulation:
- Data security (data hiding)
- Code modularity
- Maintainability
- Controlled access and validation
- Code reusability

---------

###Design (UML Overview)

<img width="445" height="220" alt="image" src="https://github.com/user-attachments/assets/baf3e05d-5551-4d79-b699-120b04e01faf" />



--------
### IMPLEMENTATION:
https://github.com/Rajbongshi2005/LabReport02-Encapsulation.git

-------

####TEST RESULT:

<img width="638" height="297" alt="image" src="https://github.com/user-attachments/assets/be061212-c56a-45e5-b93f-d24c01ea0a35" />

######ANALYSIS AND DISCUSSION:

The main objective of this experiment was to analyze the concept of
Encapsulation in Java OOP and to observe its practical implementation
through a real-world example. For this purpose, a BankAccount class was
designed, where all important data members were declared as private. As a
result, the internal data of the class cannot be accessed or modified directly
from outside the class. During the implementation of the program, it was observed that
Encapsulation plays a vital role in ensuring data security and data integrity. For example, the balance variable cannot be modified directly from the main
method. Instead, the balance must be updated through the setBalance()
method, where any negative input value is automatically rejected. This
demonstrates that Encapsulation ensures data validation and prevents invalid
or incorrect input. Furthermore, this program highlights another important aspect of
Encapsulation—maintainability and flexibility. If the internal logic of the
BankAccount class is changed in the future (such as adding transaction
history or modifying balance calculation rules), no changes will be required in
the external code as long as the structure of the public methods remains
unchanged. In conclusion, the use of Encapsulation provides the program with a well- organized and modular structure. Each BankAccount object functions as a
self-contained unit, making the code more readable, easier to debug, and
extensible for future enhancements. This analysis clearly demonstrates that
Encapsulation is a crucial OOP principle, essential for developing secure,
reliable, and maintainable software.

