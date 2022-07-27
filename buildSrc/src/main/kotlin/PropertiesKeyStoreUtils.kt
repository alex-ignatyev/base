import java.io.File
import java.util.Properties

private const val KEYSTORE_FILE = "KEYSTORE_FILE"
private const val KEY_ALIAS = "KEY_ALIAS"
private const val KEY_PASSWORD = "KEY_PASSWORD"

fun getKeystoreFile(rootDir: String, properties: String) =
    File(
        rootDir,
        getValueFromPropertiesByKey(
            rootDir = rootDir,
            fileName = properties,
            propertyName = KEYSTORE_FILE
        )
    )

fun getKeyAlias(rootDir: String, properties: String) = getValueFromPropertiesByKey(
    rootDir = rootDir,
    fileName = properties,
    propertyName = KEY_ALIAS
)

fun getKeyPassword(rootDir: String, properties: String) = getValueFromPropertiesByKey(
    rootDir = rootDir,
    fileName = properties,
    propertyName = KEY_PASSWORD
)

private fun getValueFromPropertiesByKey(
    rootDir: String,
    fileName: String,
    propertyName: String
): String {
    val properties = Properties().apply { File(rootDir, fileName).inputStream().use(::load) }
	println(properties)
    val propertyValue = properties[propertyName]?.toString().orEmpty()
    if (propertyValue.isEmpty()) {
        throw IllegalArgumentException("Property name = $propertyName not found in $rootDir/$fileName")
    }
    return propertyValue
}

enum class SignInPropertiesFile(val fileName: String) {
    DEBUG("debug.properties"),
    RELEASE("upload.properties")
}
