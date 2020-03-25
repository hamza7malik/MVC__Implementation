public class Main {
    public static void main(String[] args) {
        EmployeeModel model  = retriveEmployee();
        EmployeeView view = new EmployeeView();
        Controller controller = new Controller(model,view);
        controller.update_View();
        controller.setfirstName("Ali");
        controller.update_View();
    }
    private static EmployeeModel retriveEmployee(){
        EmployeeModel employee = new EmployeeModel();

        employee.setfirstName("Hamza");


        return employee;
    }
}
