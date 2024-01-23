/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package business.Patient;

/**
 *
 * @author nagal
 */
public enum Issue {
    // Physical Health Issues
    MALNUTRITION("Malnutrition", "Lack of proper nutrition leading to deficiencies and related health problems."),
    CHRONIC_PAIN("Chronic Pain", "Persistent pain, often related to untreated injuries or underlying medical conditions."),
    INFECTIOUS_DISEASES("Infectious Diseases", "Conditions such as respiratory infections, skin infections, or diseases that can spread in crowded living conditions."),
    DENTAL_PROBLEMS("Dental Problems", "Issues with oral health, including tooth decay, gum disease, and lack of access to dental care."),
    FOOT_PROBLEMS("Foot Problems", "Conditions like infections, injuries, or foot pain due to inadequate footwear."),
    SLEEP_DISORDERS("Sleep Disorders", "Disruptions in normal sleep patterns due to various factors, including exposure to the elements and unsafe sleeping conditions."),
    HYPOTHERMIA_HEAT_STROKE("Hypothermia/Heat Stroke", "Extreme temperature-related conditions due to exposure to harsh weather conditions."),

    // Mental Health Issues
    DEPRESSION("Depression", "Persistent feelings of sadness, hopelessness, and a lack of interest or pleasure in activities."),
    ANXIETY_DISORDERS("Anxiety Disorders", "Excessive worry, fear, or uneasiness, often accompanied by physical symptoms like restlessness."),
    PTSD("Post-Traumatic Stress Disorder (PTSD)", "Mental health condition triggered by experiencing or witnessing traumatic events."),
    SUBSTANCE_ABUSE("Substance Abuse", "Misuse of drugs or alcohol as a coping mechanism or escape from difficult circumstances."),
    SCHIZOPHRENIA("Schizophrenia", "A severe mental disorder characterized by disturbances in thought, perception, and behavior."),
    BIPOLAR_DISORDER("Bipolar Disorder", "Mood disorder involving extreme mood swings, including manic highs and depressive lows."),
    PSYCHOSIS("Psychosis", "Loss of touch with reality, often manifested through delusions or hallucinations."),
    SOCIAL_ISOLATION("Social Isolation", "Feelings of extreme loneliness and disconnection from others."),

    // Social Issues
    HOMELESSNESS("Homelessness", "Lack of stable housing and living on the streets or in temporary shelters."),
    LACK_OF_SOCIAL_SUPPORT("Lack of Social Support", "Absence of a reliable social network, including family and friends."),
    DISCRIMINATION_STIGMATIZATION("Discrimination and Stigmatization", "Negative attitudes or behaviors directed towards individuals experiencing homelessness."),
    LEGAL_ISSUES("Legal Issues", "Facing legal challenges, such as arrests, fines, or court appearances, often related to living conditions or survival activities."),
    LIMITED_ACCESS_TO_SERVICES("Limited Access to Services", "Challenges in accessing essential services such as healthcare, education, and employment assistance."),

    // Economic Issues
    UNEMPLOYMENT("Unemployment", "Lack of stable employment or consistent income."),
    FINANCIAL_INSTABILITY("Financial Instability", "Challenges in managing finances, often living in poverty."),
    DEBT("Debt", "Accumulation of financial debts, which can further contribute to economic instability."),
    LIMITED_EDUCATION("Limited Education", "Lack of access to education and skill development opportunities."),

    // General Well-being
    HYGIENE_SANITATION("Hygiene and Sanitation", "Challenges in maintaining personal hygiene due to limited access to facilities."),
    ACCESS_TO_CLEAN_WATER_NUTRITION("Access to Clean Water and Nutrition", "Limited access to clean water sources and nutritious food."),
    TRANSPORTATION("Transportation", "Challenges in accessing transportation for commuting or reaching essential services."),
    SAFETY_AND_SECURITY("Safety and Security", "Concerns related to personal safety and the security of belongings."),
    ISOLATION_AND_LONELINESS("Isolation and Loneliness", "Feelings of isolation and loneliness, often exacerbated by the lack of social connections."),

    // Other
    OTHER("Other", "Other health, social, economic, or general well-being issues not explicitly listed.");

    private final String issueName;
    private final String issueDescription;

    Issue(String issueName, String issueDescription) {
        this.issueName = issueName;
        this.issueDescription = issueDescription;
    }

    public String getIssueName() {
        return issueName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    // Static method to get description by name
    public static String getDescriptionByName(String name) {
        for (Issue issue : Issue.values()) {
            if (issue.getIssueName().equals(name)) {
                return issue.getIssueDescription();
            }
        }
        throw new IllegalArgumentException("No enum constant with name: " + name);
    }
}
