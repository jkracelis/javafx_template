package org.example.frontend.routes;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import org.example.frontend.features.dashboard.DashboardView;
import org.example.frontend.features.home.HomeView;
import org.example.frontend.shared.components.layout.NavigationService;

public class MainController {
    @FXML
    private StackPane contentArea;
    
    private DashboardView dashboardView;
    private HomeView homeView;
    
    @FXML
    public void initialize() {
        // Register content area with navigation service
        NavigationService.setContentArea(contentArea);
        
        // Initialize views
        dashboardView = new DashboardView();
        homeView = new HomeView();
        
        // Show home by default
        showHome();
    }
    
    @FXML
    private void showHome() {
        contentArea.getChildren().clear();
        contentArea.getChildren().add(homeView);
    }
    
    @FXML
    private void showDashboard() {
        contentArea.getChildren().clear();
        contentArea.getChildren().add(dashboardView);
    }
}
