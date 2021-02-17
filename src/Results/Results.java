package Results;

public class Results {

	public static void main(String[] args) {
		int totalMarks = examMarks(70, 80, 90);
		percentage(totalMarks);

	}

	public static int examMarks(int physics, int chemistry, int biology) {

		int failedExams = 0;

		if (physics < 60 || chemistry < 60 || biology < 60) {
			System.out.println("Sorry You failed science");
		} else if (physics > 60 && chemistry > 60 && biology > 60) {
			System.out.println("Congratulations! You passed science!");
		}

		System.out.println();

		if (physics < 60) {
			System.out.println("Sorry, you failed the exam");
			failedExams++;
		} else {
			System.out.println("Congratulations! You passed the exam!");
		}

		System.out.println("Your mark for Physics was:" + physics);
		System.out.println();

		if (chemistry < 60) {
			System.out.println("Sorry, you failed the exam");
			failedExams++;
		} else {
			System.out.println("Congratulations! You passed the exam!");
		}

		System.out.println("Your mark for Chemistry was:" + chemistry);
		System.out.println();

		if (biology < 60) {
			System.out.println("Sorry, you failed the exam");
			failedExams++;
		} else {
			System.out.println("Congratulations! You passed the exam!");
		}

		System.out.println("Your mark for Biology was:" + biology);
		System.out.println();

		if (failedExams > 0) {
			System.out.println("You failed " + failedExams + " of your science exams.");
		} else {
			System.out.println("Congratulations! You passed all of your exams!");
		}
		System.out.println();

		int total = physics + chemistry + biology;
		System.out.println("Your total marks: " + total);
		return total;

	}

	public static void percentage(int totalMarks) {
		int percentage = (totalMarks * 100) / 450;
		System.out.println("Your overall percentage in science is: " + percentage);
	}

}
