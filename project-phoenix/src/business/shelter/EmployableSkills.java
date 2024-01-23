/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package business.shelter;

/**
 *
 * @author ketan
 */
public enum EmployableSkills {
    CUSTOMER_SERVICE("Customer Service Skills", "Training in basic customer interactions and communication."),
    BASIC_COMPUTER("Basic Computer Skills", "Introduction to using computers, email, and basic software applications."),
    CASHIER("Cashier Skills", "Handling transactions and using point-of-sale systems."),
    RETAIL("Retail Skills", "Stocking shelves, organizing inventory, and assisting customers."),
    FOOD_SERVICE("Food Service Skills", "Basic food preparation, hygiene, and customer service in a cafe or fast-food setting."),
    DATA_ENTRY("Data Entry", "Basic data entry tasks using spreadsheet software."),
    CLEANING_MAINTENANCE("Cleaning and Maintenance", "Basic janitorial or maintenance skills for various work environments."),
    OFFICE_SKILLS("Basic Office Skills", "Filing, organizing paperwork, and general office tasks."),
    SALES("Sales Skills", "Basic techniques for sales and persuasion."),
    TIME_MANAGEMENT("Time Management", "Training on managing tasks and responsibilities efficiently.");

    private final String skillName;
    private final String description;

    EmployableSkills(String skillName, String description) {
        this.skillName = skillName;
        this.description = description;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getDescription() {
        return description;
    }
}
