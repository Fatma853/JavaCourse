
public class Main {

	public static void main(String[] args) {
		Instructor instructor1= new Instructor();
		instructor1.firstName="Engin";
		instructor1.lastName="Demiroð";
		instructor1.katilimciUnvani="Eðitmen";
		instructor1.password=123;
		instructor1.sertifikalar="(MCT) ,PMP ve ITIL ";
		instructor1.verilenEgitimler="Java";
		
		Student student1= new Student();
		student1.firstName="Fatma";
		student1.lastName="Akkaya";
		student1.password=135;
		student1.katilimciUnvani="Öðrenci";
		student1.alinanEgitimler="java";
		
		User user = new User();
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		System.out.println();
		
		StudentManager studentManager = new StudentManager();
		studentManager.finishAndContinue(student1);
		System.out.println();
		
		UserManager userManager = new UserManager();
		userManager.openTheCourse(user); 
		
		
		
		
		
		

	}

}
