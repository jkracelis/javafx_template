# JavaFX Template

A modern JavaFX application template with a clean, feature-based architecture and cross-platform support.

## 🚀 Quick Start

### Prerequisites
- Java 21 or higher
- Gradle 9.2.1 or higher (included via wrapper)

### Running the Application

#### Development Mode
```bash
# Start the application with hot restart capabilities
./run.sh
```

#### Direct Execution
```bash
# Simple run
./gradlew run

# Clean build and run
./gradlew clean run
```

## 📁 Project Structure

```
javafx_template/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   └── org/example/
│       │   │       ├── backend/
│       │   │       │   └── App.java                    # Main application entry point
│       │   │       └── frontend/
│       │   │           ├── features/
│       │   │           │   ├── dashboard/              # Dashboard feature
│       │   │           │   │   ├── DashboardView.java
│       │   │           │   │   └── DashboardView.fxml
│       │   │           │   └── home/                   # Home feature
│       │   │           │       ├── HomeController.java
│       │   │           │       ├── HomeView.java
│       │   │           │       └── HomeView.fxml
│       │   │           ├── routes/
│       │   │           │   └── MainController.java      # Main layout controller
│       │   │           └── shared/
│       │   │               └── components/
│       │   │                   └── layout/
│       │   │                       ├── NavigationService.java  # Navigation logic
│       │   │                       ├── Layout.fxml              # Main layout
│       │   │                       └── Layout.css               # Global styles
│       │   └── resources/
│       │       └── org/example/frontend/                 # FXML and CSS files
│       └── test/
│           └── java/
│               └── org/example/                          # Unit tests
├── docs/                                                 # Documentation
├── build.gradle                                          # Gradle build configuration
├── settings.gradle                                       # Gradle settings
├── run.sh                                                # Development runner with hot restart
├── build.sh                                              # Cross-platform build script
├── build.bat                                             # Windows build script
└── README.md                                             # This file
```

## 🏗️ Architecture

### Feature-Based Structure
The application follows a feature-based architecture where each major functionality is organized as a separate feature module:

- **Features**: Independent modules (Dashboard, Home, etc.)
- **Shared Components**: Reusable UI components and services
- **Routes**: Navigation and layout controllers
- **Backend**: Application entry point and backend related

## 🔧 Development

### Adding New Features

1. **Create Feature Directory**:
   ```bash
   mkdir -p app/src/main/java/org/example/frontend/features/yourfeature
   mkdir -p app/src/main/resources/org/example/frontend/features/yourfeature
   ```

2. **Create Feature Files**:
   - `YourFeatureController.java` - Feature logic
   - `YourFeatureView.java` - View class
   - `YourFeatureView.fxml` - UI layout

3. **Update NavigationService**:
   ```java
   public static void showYourFeature() {
       if (contentArea != null) {
           contentArea.getChildren().clear();
           contentArea.getChildren().add(new YourFeatureView());
       }
   }
   ```

4. **Add Navigation Button** in `Layout.fxml`

### Build Commands

```bash
# Development
...working on it
```

## 🧪 Testing

Run the test suite:
```bash
./gradlew test
```

Test reports are generated in:
- HTML: `app/build/reports/tests/test/index.html`
- Console: Direct output to terminal

## 🔍 Troubleshooting

### Common Issues

1. **Gradle Wrapper Not Executable**:
   ```bash
   chmod +x gradlew
   ```

2. **Java Version Mismatch**:
   ```bash
   java -version  # Should be Java 21+
   ```

3. **Build Failures**:
   ```bash
   ./gradlew clean build  # Try clean build first
   ```

4. **UI Not Loading**:
   - Check FXML file paths
   - Verify controller class names
   - Ensure CSS files are in correct locations

### Development Tips

- Use `./run.sh` for development with hot restart capabilities
- Press 'r' to restart the application without stopping the script
- Press 'q' to quit the development runner
- Press Ctrl+C to force stop all processes

## 📚 Dependencies

### Core Dependencies
- **JavaFX**: UI framework## 🤝 Contributing

1. Follow the existing code style and structure
2. Add tests for new features
3. Update documentation for API changes
4. Use feature-based architecture for new functionality

---

**Built with ❤️ using JavaFX 21 and Gradle 9.2.1**
- **FXMLKit**: Enhanced FXML support
- **JUnit 5**: Testing framework

### Gradle Plugins
- **Java Plugin**: Java compilation and packaging
- **JavaFX Plugin**: JavaFX application support
- **Toolchains Plugin**: JDK management