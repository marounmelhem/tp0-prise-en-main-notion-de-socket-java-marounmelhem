package net.cofares.opentraining.priseenmain;

public class Data {

    /**
     * Id de la data (obligatoire)
     */
    private final String _id;
    /**
     * Par exemple ATTRIBUT (obligatoire)
     */
    private final String _data;
    /**
     * Un autre exemple d'attribut (option)
     */
    private String _commentaires;
    
    /**
     * Le constructeur avec un builder
     * @param db 
     */
    public Data(DataBuilder db) {
        _id=db._id;
        _data=db._data;
        _commentaires=db._commentaires;
    }

    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @return the _data
     */
    public String getData() {
        return _data;
    }

    /**
     * @return the _commentaires
     */
    public String getCommentaires() {
        return _commentaires;
    }

    /**
     * @param _commentaires the _commentaires to set
     */
    public void setCommentaires(String _commentaires) {
        this._commentaires = _commentaires;
    }

    /**
     * Une classe builder interne (et static)
     * a utiliser par new Data.DataBuilder(___).attribut1(_)....build();
     */
    public static class DataBuilder {

        /**
         * Ide de la data (obligatoire)
         */
        String _id;
        /**
         * Donne de la data (obligatoire)
         */
        String _data;
        /**
         * Commentaire (option)
         */
        String _commentaires;
        
        /** 
         * Constructeur minimal du pattern Builder 
         * est la Liste des attributs obligatoires
         * @param id
         * @param data 
         */
        public DataBuilder(String id,String data) {
            _id=id;
            _data=data;
        }
        /**
         * Paramètre de build tout attribut optionnel renvoi un builder
         * @param commentaire
         * @return un DataBuilder pour enchaîner les mise a jour du builder
         */
        public DataBuilder commentaire(String commentaire) {
            _commentaires=commentaire;
            return this;
        }
        
        /**
         * Le build
         * @return objet à créer
         */
        public Data build(){
            return new Data(this);
        }
    }
}
