public class ManagementSystem {

  CustomerManagementSystem customerManagementSystem = new CustomerManagementSystem();
  DatabaseManagementSystem databaseManagementSystem = new DatabaseManagementSystem();
  EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();
  EmailSystem emailSystem = new EmailSystem();
  FileManagementSystem fileManagementSystem = new FileManagementSystem();
  InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();
  LogSystem logSystem = new LogSystem();
  NotificationSystem notificationSystem = new NotificationSystem();
  PrintManagementSystem printManagementSystem = new PrintManagementSystem();
  ProjectManagementSystem projectManagementSystem = new ProjectManagementSystem();
  ReportGenerator reportGenerator = new ReportGenerator();
  SalesManagementSystem salesManagementSystem = new SalesManagementSystem();


  // Employees
  public void addEmployee(String name, int id, String department) {
    employeeManagementSystem.addEmployee(name, id, department);
  }

  public void updateEmployee(int id, String newName) {
    employeeManagementSystem.updateEmployee(id, newName);
  }

  public void removeEmployee(int id) {
    employeeManagementSystem.removeEmployee(id);
  }

  public void processPayroll(int employeeId, double salary) {
    employeeManagementSystem.processPayroll(employeeId, salary);
  }

  public void generatePayrollReport() {
    employeeManagementSystem.generatePayrollReport();
  }


  // Projects
  public void assignProject(int employeeId, String project) {
    projectManagementSystem.assignProject(employeeId, project);
  }

  public void completeProject(int employeeId, String project) {
    projectManagementSystem.completeProject(employeeId, project);
  }

  public void generateProjectStatusReport(String project) {
    projectManagementSystem.generateProjectStatusReport(project);
  }


  // Customer
  public void addCustomer(String name, String email) {
    customerManagementSystem.addCustomer(name, email);
  }

  public void updateCustomer(int customerId, String newEmail) {
    customerManagementSystem.updateCustomer(customerId, newEmail);
  }

  public void removeCustomer(int customerId) {
    customerManagementSystem.removeCustomer(customerId);
  }

  public void sendPromotionalEmail(int customerId, String promotion) {
    customerManagementSystem.sendPromotionalEmail(customerId, promotion);
  }


  // Sales
  public void recordSale(int customerId, double amount) {
    salesManagementSystem.recordSale(customerId, amount);
  }

  public void generateSalesReport() {
    salesManagementSystem.generateSalesReport();
  }


  // Inventory
  public void addInventoryItem(String item, int quantity) {
    inventoryManagementSystem.addInventoryItem(item, quantity);
  }

  public void updateInventoryItemQuantity(String item, int quantity) {
    inventoryManagementSystem.updateInventoryItemQuantity(item, quantity);
  }

  public void removeInventoryItem(String item) {
    inventoryManagementSystem.removeInventoryItem(item);
  }

  public void generateInventoryReport() {
    inventoryManagementSystem.generateInventoryReport();
  }


  // Reports
  public void generateCompanyWideReport() {
    reportGenerator.generateCompanyWideReport();
  }


  // Database
  public void connectToDatabase() {
    databaseManagementSystem.connectToDatabase();
  }

  public void disconnectFromDatabase() {
    databaseManagementSystem.disconnectFromDatabase();
  }

  public void saveDataToDatabase(String data) {
    databaseManagementSystem.saveDataToDatabase(data);
  }

  public void loadDataFromDatabase() {
    databaseManagementSystem.loadDataFromDatabase();
  }


  // Files
  public void saveReportToFile(String report, String filePath) {
    fileManagementSystem.saveReportToFile(report, filePath);
  }

  public void loadReportFromFile(String filePath) {
    fileManagementSystem.loadReportFromFile(filePath);
  }

  public void sendEmail(String emailAddress, String subject, String message) {
    emailSystem.sendEmail(emailAddress, subject, message);
  }

  public void sendSystemNotification(String notification) {
    notificationSystem.sendSystemNotification(notification);
  }

  public void logEvent(String event) {
    logSystem.logEvent(event);
  }

  public void printDocument(String document) {
    printManagementSystem.printDocument(document);
  }


  // System
  public void shutdownSystem() {
    System.out.println("System shutting down...");
  }

}
