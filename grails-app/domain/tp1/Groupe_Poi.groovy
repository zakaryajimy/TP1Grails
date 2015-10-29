package tp1

class Groupe_Poi {

    String nom

    static hasOne = [image : Image_Ill]
    static hasMany = [pois:Poi]

    static constraints = {
        nom blank: false
        pois unique: true
        pois list()
    }
}
