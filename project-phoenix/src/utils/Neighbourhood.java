/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package utils;

/**
 *
 * @author nagal
 */
public enum Neighbourhood {
    BACK_BAY("Back Bay", "Known for its Victorian brownstone homes, high-end shopping along Newbury Street, and the scenic Charles River Esplanade."),
    BEACON_HILL("Beacon Hill", "A historic neighborhood with cobblestone streets, gas lamps, and brick townhouses. Home to the Massachusetts State House."),
    SOUTH_END("South End", "Characterized by its Victorian architecture and vibrant arts scene, the South End is known for its numerous parks, trendy boutiques, and diverse dining options."),
    NORTH_END("North End", "Boston's 'Little Italy,' famous for its historic sites like the Old North Church and Paul Revere's House, as well as its delicious Italian restaurants."),
    FENWAY_KENMORE("Fenway-Kenmore", "Home to Fenway Park, the iconic baseball stadium, and the Boston Symphony Orchestra. A lively area with a mix of residential and commercial spaces."),
    CHARLESTOWN("Charlestown", "A historic waterfront neighborhood featuring the Bunker Hill Monument and the USS Constitution Museum. Known for its preserved 19th-century architecture."),
    DORCHESTER("Dorchester", "One of Boston's largest neighborhoods, known for its diverse communities and historical sites. It has a mix of residential and commercial areas."),
    ROXBURY("Roxbury", "A historically significant neighborhood with a rich African American cultural heritage. It has experienced revitalization and development in recent years."),
    JAMAICA_PLAIN("Jamaica Plain", "A diverse neighborhood with a mix of green spaces, trendy shops, and a strong sense of community. Known for the Arnold Arboretum and Jamaica Pond."),
    EAST_BOSTON("East Boston", "Located across the harbor, East Boston is known for its waterfront views, diverse communities, and proximity to Logan International Airport."),
    WEST_END("West End", "Once a bustling immigrant neighborhood, the West End underwent significant urban renewal. Home to Massachusetts General Hospital, it has a mix of residential and commercial spaces."),
    ALLSTON_BRIGHTON("Allston-Brighton", "Home to many students due to its proximity to Boston University and Boston College. It has a lively nightlife, ethnic restaurants, and a mix of housing options."),
    MISSION_HILL("Mission Hill", "Known for its academic institutions and hospitals, Mission Hill has a youthful vibe. The neighborhood offers a mix of residential and commercial spaces."),
    SOUTH_BOSTON("South Boston", "Traditionally an Irish-American neighborhood, South Boston (Southie) has a strong community feel, waterfront parks, and a vibrant St. Patrick's Day parade."),
    WEST_ROXBURY("West Roxbury", "A suburban-like neighborhood with tree-lined streets and a mix of residential housing. Known for its community parks and recreational spaces."),
    HYDE_PARK("Hyde Park", "The southernmost neighborhood in Boston, Hyde Park offers a suburban atmosphere with parks, historic sites, and a mix of housing options."),
    MATTAPAN("Mattapan", "A predominantly residential neighborhood with a diverse population. Mattapan has parks, community centers, and is known for its cultural events.");

    private final String name;
    private final String description;

    Neighbourhood(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    // Static method to get description by name
    public static String getDescriptionByName(String name) {
        for (Neighbourhood neighbourhood : Neighbourhood.values()) {
            if (neighbourhood.getName().equals(name)) {
                return neighbourhood.getDescription();
            }
        }
        throw new IllegalArgumentException("No enum constant with name: " + name);
    }
}
