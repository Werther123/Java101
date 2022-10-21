package MaasHesaplayici;

public class Employee{
 
    String name;
    int salary;
    int workHours;
    int hireYear;
    int vergi;
    int temp,temp1;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        temp = this.salary;
        if(temp <= 1000){
            System.out.println("Vergi Ücreti Yoktur");   
        }
        else{
            temp = (temp/100) * 3;
            System.out.println("Vergi Ücreti: " + temp);
        }
    }
    void bonus(){
        if(this.workHours >= 40){
            this.workHours = this.workHours - 40;
            this.workHours = this.workHours * 30;
            System.out.println("Mesai Ücreti: " + this.workHours);
        }
        else{
            System.out.println("Mesai Ücreti Yoktur");
        }
    }

    void raiseSalary(){
        temp1 = this.salary;
        if(2021 - this.hireYear <10 ){
            temp1 = (temp1/100 *5);
            System.out.println("Maaş Zammı: " + temp1);
        }
        else if((2021-this.hireYear >=10 && 2021-this.hireYear<20)){
            temp1 = (temp1/100 *10);
            System.out.println("Maaş Zammı: " + temp1);
        }
        else if(2021-this.hireYear >=20){
            temp1 = (temp1/100 *15);
            System.out.println("Maaş Zammı: " + temp1);

        }
    }
    
    void print(){
            System.out.println("Ad/Soyad: " + this.name);
            System.out.println("Çalışanın Aldığı Ücret : " + this.salary);
            System.out.println("Çalışma Saati: " + this.workHours);
            System.out.println("Başlangıç Yılı: " + this.hireYear);
            tax();
            bonus();
            raiseSalary();
            System.out.println("Net Ücret: " + (this.salary+this.workHours+ temp1 - temp));

    }

}