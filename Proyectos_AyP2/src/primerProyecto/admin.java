package primerProyecto;

public class admin {
	public String user;
	public String pass;

	public admin(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public static boolean iniciarSesionA(String user, String pass, admin ingresoAdmin) {
		boolean valor = false;
		if (user.equals(ingresoAdmin.user) && pass.equals(ingresoAdmin.pass)) {
			valor = true;
		} else {
			valor = false;
		}
		return valor;
	}

	public static void eliminarUsuario(usuarios pointer, usuarios head, String idUsuario) {// Elimina al usuario con la
																							// identificación elegida
		usuarios temp = null;
		pointer = head;
		if (head != null) {
			while (pointer.next != null) {
				if (pointer.id.equals(idUsuario)) {
					temp = pointer;
					pointer = pointer.next.next;
					temp = null;
					break;
				}
				pointer = pointer.next;
			}
		}
	}

	public static void eliminarProyecto(proyectos pointer, proyectos head, int idProyecto) {// Elimina el proyecto con
																							// la identificación elegida
		proyectos temp = null;
		pointer = head;
		if (head != null) {
			while (pointer.next != null) {
				if (pointer.id == idProyecto) {
					temp = pointer;
					pointer = pointer.next.next;
					temp = null;
					break;
				}
				pointer = pointer.next;
			}
		}
	}

	public static void mostrarProyectosyUsuarios(usuarios pointerU, usuarios headU, proyectos pointerPy,
			proyectos headPy) {
		usuarios.mostrarUsuarios(pointerU, headU);
		proyectos.mostrarProyectos(pointerPy, headPy);
	}
}