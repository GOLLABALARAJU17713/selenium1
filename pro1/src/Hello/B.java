package Hello;
class employee{
    private String Name;
    private int Id;
    private String Department;
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id=Id;
    }
    public String getDepartment()
    {
        return Department;
    }
    public void setDepartment(String Department)
    {
        this.Department=Department;
    }
   /* employee(String Name,int Id, String Department)
    {
        this.Name=Name;
        this.Department=Department;
        this.Id=Id;
    }
    public void work()
    {
        System.out.println(Name+"  emp id is "+Id+" department is "+ Department);
    }*/
}
 class B {

    public static void main(String []args)
    {
        employee e1=new employee();
        e1.setId(3);
        e1.setDepartment("cinema");
        e1.setName("Balayya");
        display(e1);
    }
     public static void display(employee e)
    {
        System.out.println("employee id is :"+e.getId());
        System.out.println("employee name is : "+e.getName());
        System.out.println("employee department is :"+e.getDepartment());

    }
}
