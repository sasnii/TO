package Builder;

public class Employee {
    private String name;
    private String surname;
    private String address;
    private int income;
    private int age;   
    
    public static void main(String[] args) {
            Employee employee = new Employee.Builder().setName("Jakub")
            .setSurname("Sasnal")
            .setAddress("ul. Warszawska 24, Kraków")
            .setIncome(2500)
            .setAge(22)
            .build();
    }
    
    
    private Employee(String name, String surname, String address, int income, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.income = income;
        this.age = age;
    }
    

    
    public static class Builder{
        private String name;
        private String surname;
        private String address;
        private int income;
        private int age; 
        
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        
        public Builder setSurname(String surname){
            this.surname = surname;
            return this;
        }
                
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setIncome(int income){
            this.income = income;
            return this;
        }
        
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        
        public Employee build(){
            return new Employee(name, surname, address, income, age);
        }
    }
}
