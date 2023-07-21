package src.MaasHesaplayıcı;

public class Employee {
    String name ;
    double salary ;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name= name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if (this.salary<1000){
            return 0;
        } else if (this.salary>1000) {
            return this.salary * 0.03;
        }
        return this.salary;
    }

    public double bonus(){
        int bonus = 0;
        if(this.workHours>40){

            bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        return bonus;
    }
    public double raiseSalary(){
        int year = 2021 - this.hireYear;
        if (year<10){
            return this.salary*0.03;
        } else if ( year >9 && year <20) {
            return this.salary*0.1;
        }else if (year >20){
            return this.salary * 0.15;
        }
        return 0 ;
    }

    public void Info(){
        System.out.println("Adı : "+ this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma Saati : "+ this.workHours);
        System.out.println("Başlangıç Yılı  : "+ this.hireYear);
        System.out.println("Vergi  : "+ tax());
        System.out.println("Bonus : "+ bonus());
        System.out.println("Maaş Artışı : "+ raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :  " + (this.salary+bonus()-tax()));
        System.out.println("Toplam Maaş : " + (salary +  raiseSalary() + bonus()));






    }
    }
