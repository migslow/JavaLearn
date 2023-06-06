package Sesion_03;

public class Departamento {
	private int deptno;
	private String dname;
	private String log;

	public Departamento() {
		super();
	}

	public Departamento(int deptno, String dname, String log) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.log = log;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "Departamento [deptno=" + deptno + ", dname=" + dname + ", log=" + log + "]";
	}

}
