import java.util.Date;

public class Controller {
    private EmployeeModel model;
    private EmployeeView view;

    public Controller(EmployeeModel model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public void setemployeelD(String employeelD){
        model.setemployeelD(employeelD);
    }

    public String getemployeelD(){
        return model.getemployeelD();
    }

    public void setfirstName(String firstName){
        model.setfirstName(firstName);
    }

    public String getfirstName(){
        return model.getfirstName();
    }

    public void setlastName(String lastName){
        model.setlastName(lastName);
    }

    public String getlastName(){
        return model.getlastName();
    }


    public void setgender(String gender){
        model.setgender(gender);
    }

    public String getgender(){
        return model.getgender();
    }

    public void sethiredDate(String hiredDate){
        model.sethiredDate(hiredDate);
    }

    public String gethiredDate(){
        return model.gethiredDate();
    }

    public void setsalary(String salary){
        model.setsalary(salary);
    }

    public String getsalary(){
        return model.getsalary();
    }

    public void update_View(){
        view.Print_Details(model.getemployeelD(), model.getfirstName(),model.getlastName(), model.getgender(),model.gethiredDate(),model.getsalary() );
    }
}
