# PyroAPI

**PyroAPI** is the centralized, standalone API for all plugins in the **Pyro** series. This library allows developers to easily interact with multiple Pyro plugins without needing to rely on internal classes from each plugin individually.

---

## ✅ Supported Plugins & Versions

This API currently supports the following plugins and their minimum required versions:

- **PyroFishingPro** `v4.10.0+`
- **PyroMining** `v5.0.0+`
- **PyroWeatherPro** `v4.4.0+`
- **PyroFarming** `v1.4.0+`

> 🔥 Note: This API is still in development. Please check if the above versions match your current release/version, and if they don't, see if they exist. If it doesn't yet, then it is still in-development.

---

## 📦 Purpose

Starting with this release, **all API methods will be removed from the individual premium plugin jars**. Instead, this external API library will be the **only dependency required** to interact with the APIs of any supported Pyro plugin.

This makes development and support cleaner, more consistent, and easier to maintain.

---

## 💬 Feature Requests

I’m open to suggestions for new features or expanded support. While these are not a top development priority, I’m happy to consider any requests made via my **[Discord server](https://discord.gg/zNtFN3m)**.

---

## 📚 Getting Started

To use this API in your project:

1. **Download** the latest `PyroAPI` release from the GitHub [Releases](../../releases) section.
2. **Add it as a dependency** in your plugin project.
3. Make sure the required plugins are installed on the server with the correct versions (listed above).

Example usage:

```java
Plugin pyroFishingPro = getServer().getPluginManager().getPlugin("PyroFishingPro");
boolean hasPyroFishingPro = pyroFishingPro != null && pyroFishingPro.isEnabled();
		
if(hasPyroFishingPro) {
    PyroFishingProAPI pyroFishingProAPI = PyroAPI.PYROFISHING_API;
    // Safe to call methods;
}
```
## Compile PyroAPI Yourself
Prerequisites:
* [Java 17+](https://adoptopenjdk.net/) (required)
* [Maven](https://maven.apache.org/download.cgi) installed and added to your `PATH`

**Clone the repository and build the plugin with Maven:**
```bash
git clone https://github.com/PyroTempus/PyroAPI.git
cd PyroAPI
mvn clean package
```
* The compiled plugin will be in the `target/` directory, named `PyroAPI-<version>.jar`.
