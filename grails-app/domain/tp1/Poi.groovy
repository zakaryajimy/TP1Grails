package tp1

class Poi {

    String nom
    String emplacement
    String description

    static belongsTo = [Groupe_Poi , Utilisateur]
    static hasMany = [images : Image_Ill , groupes : Groupe_Poi , utilisateurs: Utilisateur]


    static constraints = {
        emplacement inList: ["physique","geolocalisation"], blank: false
        nom blank: false
        description blank: false
        groupes list()
    }
}
