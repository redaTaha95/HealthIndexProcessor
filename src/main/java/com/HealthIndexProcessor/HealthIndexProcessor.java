package com.HealthIndexProcessor;

public class HealthIndexProcessor {
    private static final String CARDIOLOGY = "Cardiologie";
    private static final String TRAUMATOLOGY = "Traumatologie";
    private static final String NO_SERVICE_REQUIRED = "Aucun service requis";

    /**
     * Analyse l'index de santé et retourne les services médicaux recommandés.
     *
     * @param healthIndex l'index de santé du patient
     * @return une chaîne de caractères indiquant le(s) service(s) recommandé(s)
     */
    public String getMedicalUnit(int healthIndex) {
        StringBuilder result = new StringBuilder();

        //Ajoute "Cardiologie" si l'index est un multiple  de 3
        if(isMultipleOf(healthIndex, 3)) {
            result.append(CARDIOLOGY);
        }

        // Ajoute "Traumatologie" si l'index est un multiple de 5
        if (isMultipleOf(healthIndex, 5)) {
            if (!result.isEmpty()) {
                result.append(", ");
            }
            result.append(TRAUMATOLOGY);
        }

        // Retourne le résultat ou "Aucun service requis" si aucun service ne correspond
        return !result.isEmpty() ? result.toString() : NO_SERVICE_REQUIRED;
    }

    /**
     * Vérifie si un nombre est multiple d'un autre.
     *
     * @param number le nombre à vérifier
     * @param divisor le diviseur
     * @return true si number est un multiple de divisor, false sinon
     */
    private Boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }
}
