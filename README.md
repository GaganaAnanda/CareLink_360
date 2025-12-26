CareLink_360

CareLink 360 – Application Engineering and Development (AED) 

CareLink 360 is a multi-enterprise healthcare ecosystem integrating hospitals, insurance companies, NGOs, donation units, and government organizations under a unified workflow. The system uses a modular architecture with Java Swing for UI, DB4O for persistence, and a role-based workflow powered by WorkQueues.


**📌 Project Overview
**

CareLink 360 addresses communication gaps across hospitals, insurance agencies, government units, and NGOs by creating a centralized platform for managing patient requests, insurance verifications, lab workflows, donations, and financial assistance.

The system follows a structured hierarchy:
EcoSystem → Networks → Enterprises → Organizations → Roles → WorkQueues
This design enables smooth inter-enterprise communication and coordinated workflow management.

**🧩 Key Features
**

Multi-enterprise ecosystem supporting Hospital, Insurance, NGO, Government modules

Role-specific dashboards (Doctor, Lab Assistant, Patient, Insurance Agent, Accountant, NGO Coordinator, etc.)

WorkQueue-driven workflow for request routing, approvals, and multi-step processing

DB4O-based object persistence for storing networks, enterprises, users, and requests

Swing UI panels connected to modular Business Layer classes

UML diagrams, class models, and complete architecture documentation

**📁 Repository Structure
**

/Business – Core logic, models, roles, and workflow classes

/userinterface – Java Swing UI panels for all roles

/db4o – DB4OUtil for persistence

/diagrams – UML class diagrams and architecture maps

/assets – Proposal, milestone updates, presentations

**🔧 Development Workflow
**

Each member works on an individual branch

Changes are merged into main through pull requests

This prevents merge conflicts, especially with .form files

Repository aligns with the 4-week implementation timeline:

Week 1: Architecture, UML, repo setup

Week 2: Business Layer development

Week 3: UI development & workflow integration

Week 4: Testing, fixes, final packaging

**📄 License
**

Academic project submitted for Application Engineering and Development (AED) at Northeastern University.
