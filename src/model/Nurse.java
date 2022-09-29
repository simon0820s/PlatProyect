package model;

public class Nurse extends User{
    private String especialidad;

    public Nurse(String name, String email){
        super(name,email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado");
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Pediatria");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
