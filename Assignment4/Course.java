/**
 * The Course class implements an application that constructs a course
 *
 * @author Andy Luong
 * @since 2021-03-03
 */
public class Course {
	/** Creates name */
	private String name;
	/** Creates description */
	private String description;
	/** Creates department */
	private String department;
	/** Creates time */
	private int time;
	/** Creates weekday */
	private String weekday;
	
	/** Constructor that takes in 5 arguments */
	public Course(String name, String description, String department, int time, String weekday) {
		this.name = name;
		this.description = description;
		this.department = department;
		this.time = time;
		this.weekday = weekday;
	}
	
	/** Gets name */
	public String getName() {
		return name;
	}
	
	/** Gets description  */
	public String getDescription() {
		return description;
	}
	
	/** Gets department */
	public String getDepartment() {
		return department;
	}
	
	/** Gets time */
	public int getTime() {
		return time;
	}
	
	/** Gets weekday */
	public String getWeekday() {
		return weekday;
	}
	
	/** Sets name */
	public void setName(String name) {
		this.name = name;
	}

	/** Sets description */
	public void setDescription(String description) {
		this.description = description;
	}

	/** Sets department */
	public void setDepartment(String department) {
		this.department = department;
	}

	/** Sets time */
	public void setTime(int time) {
		this.time = time;
	}
	
	/** Sets weekday */
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	
	/** Method used to print out information of Employee */
	public String toString() {
		return getName() + ", " + getDescription() + ", " + getDepartment() +
				", " + getTime() + ":00pm, " + getWeekday();
	}

}
