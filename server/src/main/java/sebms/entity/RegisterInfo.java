package sebms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "b_student_register_info")
@NamedQuery(name="RegisterInfo.findByZk",query="from RegisterInfo r where r.zkz = ?1")
public class RegisterInfo {

	@Id
	private Long id;
	
	@Column(name="zkz_no")
	private String zkz;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="specialty_plan_id")
	private Specialty specialty;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZkz() {
		return zkz;
	}

	public void setZkz(String zkz) {
		this.zkz = zkz;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	
	
}
