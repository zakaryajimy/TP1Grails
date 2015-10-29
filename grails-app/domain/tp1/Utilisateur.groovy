package tp1

class Utilisateur {

    String nom
    String prenom
    String email

    static hasMany = [pois:Poi]

    static constraints = {
        nom blank: false
        prenom blank: false
        email email: true, blank: false
    }
}
