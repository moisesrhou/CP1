/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cp1project;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Amir
 */
public class EmployeeDetails {

    
    private List<Employee> employeeList;

    public EmployeeDetails() {
        employeeList = new ArrayList<>();

        // Adding employees directly from the CSV data
        employeeList.add(new Employee("10001", "Garcia", "Manuel III", "10/11/1983", 
            "Valero Carpark Building Valero Street 1227, Makati City", "966-860-270", "44-4506057-3",
            "820126853951", "442-605-657-000", "691295330870", "Regular", "Chief Executive Officer",
            "N/A", 90000, 1500, 2000, 1000, 45000, 535.71));

        employeeList.add(new Employee("10002", "Lim", "Antonio", "06/19/1988", 
            "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite", "171-867-411", "52-2061274-9",
            "331735646338", "683-102-776-000", "663904995411", "Regular", "Chief Operating Officer",
            "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));

        employeeList.add(new Employee("10003", "Aquino", "Bianca Sofia", "08/04/1989",
            "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City", "966-889-370",
            "30-8870406-2", "177451189665", "971-711-280-000", "171519773969", "Regular", "Chief Finance Officer",
            "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));

        employeeList.add(new Employee("10004", "Reyes", "Isabella", "06/16/1994",
            "460 Solanda Street Intramuros 1000, Manila", "786-868-477", "40-2511815-0",
            "341911411254", "876-809-437-000", "416946776041", "Regular", "Chief Marketing Officer",
            "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));

        employeeList.add(new Employee("10005", "Hernandez", "Eduard", "09/23/1989",
            "National Highway, Gingoog, Misamis Occidental", "088-861-012", "50-5577638-1",
            "957436191812", "031-702-374-000", "952347222457", "Regular", "IT Operations and Systems",
            "Lim, Antonio", 52670, 1500, 1000, 1000, 26335, 313.51));
        employeeList.add(new Employee("10006", "Villanueva", "Andrea Mae", "02/14/1988", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas", 
            "918-621-603", "49-1632020-8", "382189000000", "317-674-022-000", "441093000000", "Regular", "HR Manager", "Lim, Antonio", 
            52670, 1500, 1000, 1000, 26335, 313.51));

        employeeList.add(new Employee("10007", "San Jose", "Brad", "03/15/1996", "99 Strosin Hills, Poblacion, Bislig", 
            "797-009-261", "40-2400714-1", "239193000000", "672-474-690-000", "210850000000", "Regular", "HR Team Leader", "Villanueva, Andrea Mae", 
            42975, 1500, 800, 800, 21488, 255.80));

        employeeList.add(new Employee("10008", "Romualdez", "Alice", "05/14/1992", "12A/33 Upton Isle Apt. 420, Roxas City", 
            "983-606-799", "55-4476527-2", "545653000000", "888-572-294-000", "211386000000", "Regular", "HR Rank and File", "San Jose, Brad", 
            22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10009", "Atienza", "Rosie", "09/24/1948", "90A Dibbert Terrace Apt. 190, San Lorenzo", 
             "266-036-427", "41-0644692-3", "708988000000", "604-997-793-000", "260108000000", "Regular", "HR Rank and File", "San Jose, Brad", 
            22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10010", "Alvaro", "Roderick", "03/30/1988", "#284 T. Morato corner, Scout Rallos Street, Quezon City", 
            "053-381-386", "64-7605054-4", "578115000000", "525-420-419-000", "799254000000", "Regular", "Accounting Head", "Aquino, Bianca Sofia", 
            52670, 1500, 1000, 1000, 26335, 313.51));

        employeeList.add(new Employee("10011", "Salcedo", "Anthony", "09/14/1993", "93/54 Shanahan Alley Apt. 183, Santo Tomas", 
            "070-766-300", "26-9647608-3", "126445000000", "210-805-911-000", "218002000000", "Regular", "Payroll Manager", "Alvaro, Roderick", 
            50825, 1500, 1000, 1000, 25413, 302.53));

        employeeList.add(new Employee("10012", "Lopez", "Josie", "01/14/1987", "49 Springs Apt. 266, Poblacion, Taguig", 
            "478-355-427", "44-8563448-3", "431709000000", "218-489-737-000", "113071000000", "Regular", "Payroll Team Leader", "Salcedo, Anthony", 
            38475, 1500, 800, 800, 19238, 229.02));

        employeeList.add(new Employee("10013", "Farala", "Martha", "01/11/1942", "42/25 Sawayn Stream, Ubay", 
            "329-034-366", "45-5656375-0", "233694000000", "210-835-851-000", "631130000000", "Regular", "Payroll Rank and File", "Salcedo, Anthony", 
            24000, 1500, 500, 500, 12000, 142.86));
            employeeList.add(new Employee("10014", "Martinez", "Leila", "01/11/1942", "37/46 Kulas Roads, Maragondon 0962 Quirino ", 
            "877-110-749", "27-2090996-4", "515741057496", "275-792-513-000", "631130283546", "Regular", "Payroll Rank and File", "Salcedo, Anthony", 
            24000, 1500, 500, 500, 12000, 142.86));
        employeeList.add(new Employee("10015", "Romualdez", "Fredrick", "03/10/1985", "22A/52 Lubowitz Meadows, Pililla 4895 Zambales",
                "023-079-009", "26-8768374-1", "308367000000", "598-065-761-000", "223058000000",
                "Regular", "Account Manager", "Lim, Antonio", 53500, 1500, 1000, 1000, 26750, 318.45));

        employeeList.add(new Employee("10016", "Mata", "Christian", "10/21/1987", "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu",
                "783-776-744", "49-2959312-6", "824188000000", "103-100-522-000", "631053000000",
                "Regular", "Account Team Leader", "Romualdez, Fredrick", 42975, 1500, 800, 800, 21488, 255.8));

        employeeList.add(new Employee("10017", "De Leon", "Selena", "02/20/1975", "89A Armstrong Trace, Compostela 7874 Maguindanao",
                "975-432-139", "27-2090208-8", "587272000000", "482-259-498-000", "719008000000",
                "Regular", "Account Team Leader", "Romualdez, Fredrick", 41850, 1500, 800, 800, 20925, 249.11));

        employeeList.add(new Employee("10018", "San Jose", "Allison", "06/24/1986", "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union",
                "179-075-129", "45-3251383-0", "745148000000", "121-203-336-000", "114902000000",
                "Regular", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10019", "Rosario", "Cydney", "10/06/1996", "93A/21 Berge Points, Tapaz 2180 Quezon",
                "868-819-912", "49-1629900-2", "579253000000", "122-244-511-000", "265104000000",
                "Regular", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10020", "Bautista", "Mark", "02/12/1991", "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino",
                "683-725-348", "49-1647342-5", "399665000000", "273-970-941-000", "260055000000",
                "Regular", "Account Rank and File", "Mata, Christian", 23250, 1500, 500, 500, 11625, 138.39));

        employeeList.add(new Employee("10021", "Lazaro", "Darlene", "11/25/1985", "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino",
                "740-721-558", "45-5617168-2", "606387000000", "354-650-951-000", "104908000000",
                "Probationary", "Account Rank and File", "Mata, Christian", 23250, 1500, 500, 500, 11625, 138.39));

        employeeList.add(new Employee("10022", "Delos Santos", "Kolby", "02/26/1980", "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur",
                "739-443-033", "52-0109570-6", "357451000000", "187-500-345-000", "113018000000",
                "Probationary", "Account Rank and File", "Mata, Christian", 24000, 1500, 500, 500, 12000, 142.86));

        employeeList.add(new Employee("10023", "Santos", "Vella", "12/31/1983", "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur",
                "955-879-269", "52-9883524-3", "548670000000", "101-558-994-000", "360028000000",
                "Probationary", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10024", "Del Rosario", "Tomas", "12/18/1978", "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque",
                "882-550-989", "45-5866331-6", "953902000000", "560-735-732-000", "913109000000",
                "Probationary", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));    
        employeeList.add(new Employee("10025", "Tolentino", "Jacklyn", "05/19/1984", "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao",
                "675-757-366", "47-1692793-0", "753801000000", "841-177-857-000", "210547000000",
                "Probationary", "Account Rank and File", "De Leon, Selena", 24000, 1500, 500, 500, 12000, 142.86));

        employeeList.add(new Employee("10026", "Gutierrez", "Percival", "12/18/1970", "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur",
                "512-899-876", "40-9504657-8", "797639000000", "502-995-671-000", "210897000000",
                "Probationary", "Account Rank and File", "De Leon, Selena", 24750, 1500, 500, 500, 12375, 147.32));

        employeeList.add(new Employee("10027", "Manalaysay", "Garfield", "08/28/1986", "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur",
                "948-628-136", "45-3298166-4", "810909000000", "336-676-445-000", "211274000000",
                "Probationary", "Account Rank and File", "De Leon, Selena", 24750, 1500, 500, 500, 12375, 147.32));

        employeeList.add(new Employee("10028", "Villegas", "Lizeth", "12/12/1981", "66/77 Mann Views, Luisiana 1263 Dinagat Islands",
                "332-372-215", "40-2400719-4", "934390000000", "210-395-397-000", "122238000000",
                "Probationary", "Account Rank and File", "De Leon, Selena", 24000, 1500, 500, 500, 12000, 142.86));

        employeeList.add(new Employee("10029", "Ramos", "Carol", "08/20/1978", "72/70 Stamm Spurs, Bustos 4550 Iloilo",
                "250-700-389", "60-1152206-4", "351830000000", "395-032-717-000", "212142000000",
                "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10030", "Maceda", "Emelia", "04/14/1973", "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija",
                "973-358-041", "54-1331005-0", "465088000000", "215-973-013-000", "515013000000",
                "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10031", "Aguilar", "Delia", "01/27/1989", "95 Cremin Junction, Surallah 2809 Cotabato",
                "529-705-439", "52-1859253-1", "136451000000", "599-312-588-000", "110019000000",
                "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));

        employeeList.add(new Employee("10032", "Castro", "John Rafael", "02/09/1992", "Hi-way, Yati, Liloan Cebu",
                "332-424-955", "26-7145133-4", "601645000000", "404-768-309-000", "697764000000",
                "Regular", "Sales & Marketing", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));

        employeeList.add(new Employee("10033", "Martinez", "Carlos Ian", "11/16/1990", "Bulala, Camalaniugan",
                "078-854-208", "11-5062972-7", "380685000000", "256-436-296-000", "993373000000",
                "Regular", "Supply Chain and Logistics", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));

        employeeList.add(new Employee("10034", "Santos", "Beatriz", "08/07/1990", "Agapita Building, Metro Manila",
                "526-639-511", "20-2987501-5", "918460000000", "911-529-713-000", "874042000000",
                "Regular", "Customer Service and Relations", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));    

        // Add more employees here following the same pattern...
    }

    public Employee findEmployeeById(String employeeId) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null; // Return null if employee not found
    }
// Get employee details by employee ID
public Employee getEmployeeById(String employeeId) {
    return employeeList.stream()
            .filter(employee -> employee.getEmployeeId().equals(employeeId))
            .findFirst()
            .orElse(null);
}

    
}