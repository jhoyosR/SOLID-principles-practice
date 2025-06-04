public class App {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("1093421", "Alfonso Suárez",
        15, 8, 22);
        Employee partTimeEmployee = new PartTimeEmployee("251531", "Sofía Rojas",
        22, 4, 22);

        fullTimeEmployee.showInformation();
        fullTimeEmployee.calculateSalary();
        partTimeEmployee.showInformation();
        partTimeEmployee.calculateSalary();
        System.out.println("");

        Company company = new Company();
        company.startWorkday(fullTimeEmployee);
        company.startWorkday(partTimeEmployee);
        System.out.println("");

        // Comportamientos específicos
        FreelanceEmployee freelanceEmployee = new FreelanceEmployee("4242523", "Felipe Aristizabal",
        19, 30);
        freelanceEmployee.rest();

        FullTimeEmployee fullTimeProjectManagerEmployee = new FullTimeEmployee("1341413", "Luisa Gutierrez",
        13, 8, 22);
        fullTimeProjectManagerEmployee.manageProjects();
    }
}
