# Project Management System
This project is base on an ER flow from [vertabelo.com](https://vertabelo.com/blog/organize-your-time-and-resources-a-project-management-data-model/)

There are a few popular project management approaches (Lean, PRINCE2, process-based, traditional, etc.) but we won’t go into these now. I’ll stick to the terms that are common in most project management methodologies. Some of these terms are:

Project stakeholders – All private individuals or business entities that are interested in the successful finishing of the projects. This includes the clients or sponsors of the project, but it can also include user groups, government agencies, and people who work on the project, among many others.
Project manager – The person in charge of planning, executing, and closing the project. Project managers should be properly educated in the field; they should also be able to use various techniques and tools to fulfill their role.
Activity – A single action that produces a “small” result. An activity is usually related to other activities. Some can run simultaneously and independently of each other; others must wait until some previous activity is completed. For example, ordering needed software is an activity.
Task – A group of related activities that produces a “larger” result. If we complete all project tasks successfully, we’ll also close our project successfully. So, after the ordered software is delivered (1st activity of the task) we can install it (2nd activity on the same task) and see if it works as expected (3rd activity). Once we’ve completed all these activities, we’ve also completed this task.
Critical path – A sequence of related activities that have no time buffer. If any activity on that path requires more time than allotted to it, we’ll need to respond in some way. This could mean modifying our plan, reallocating resources, decreasing quality, or extending the whole project.
Gantt chart – A graphical representation that is often used to track project progress. The Gantt chart clearly displays all tasks, activities, planned resources and budgets, activity and task statuses, critical paths etc. The X-axis is the time axis (usually measured in weeks) and the Y-axis shows the project tasks and activities. [Emil Drkušić](https://vertabelo.com/authors/emil-drkusic/)

# Business Entities
### The data model consists of three main subject areas
* [Users and roles](./docs/users_roles.md)
* [Projects](./docs/projects.md)
* [Tasks and activities](./docs/tasks_activities.md)