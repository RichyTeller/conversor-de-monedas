# Currency Converter | Conversor de monedas

Java currency-conversion project designed around an external exchange-rate API and JSON processing with **Gson**.

## Documented implementation
The original project notes describe:
- An API request component named `ConsultaApi`.
- A Java `record` to represent currency data returned by the service.
- A `Principal` class for the program's flow.
- Gson for JSON handling.
- Console-based currency conversion and manual tests.

> These features are documented by the existing README. The exact source paths, Java version, API provider, API-key requirements and build commands have **not** yet been independently verified.

## Clone the project
```bash
git clone https://github.com/RichyTeller/conversor-de-monedas.git
cd conversor-de-monedas
```

## Run in IntelliJ IDEA
1. Install **IntelliJ IDEA** and a JDK compatible with the project's source (Java records require Java 16+; check the actual project settings).
2. Open the cloned repository as a project.
3. Inspect for `pom.xml`, `build.gradle` or existing IDE project settings.
4. Ensure the **Gson** dependency is resolved using the project's dependency manager or configured library.
5. Inspect `ConsultaApi` for the API endpoint and any credentials or environment variables. Never commit API keys.
6. Locate the `Principal` class and run its `main` method in IntelliJ.
7. Follow the program's prompts and verify the returned exchange-rate data.

**Important:** If the published repository lacks the source or dependency files, these steps cannot succeed until those files are committed. No specific terminal build command is claimed here without verifying the build configuration.

## How it works (project overview)
The program obtains exchange-rate information from an external service, processes its JSON response through Gson and uses the parsed currency data in a console workflow.

## What I practiced
Java, data modeling with records, external API consumption, JSON parsing and separation of responsibilities.

## Source and download
[View the repository](https://github.com/RichyTeller/conversor-de-monedas) · [Download ZIP](https://github.com/RichyTeller/conversor-de-monedas/archive/refs/heads/main.zip)

**Author:** José Ricardo González Carmona
