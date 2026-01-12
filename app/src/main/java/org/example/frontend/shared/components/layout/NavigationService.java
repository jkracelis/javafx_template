package org.example.frontend.shared.components.layout;

import javafx.scene.layout.StackPane;
import org.example.frontend.features.dashboard.DashboardView;
import org.example.frontend.features.home.HomeView;

public class NavigationService {
    private static StackPane contentArea;
    
    public static void setContentArea(StackPane area) {
        contentArea = area;
    }
    
    public static void showDashboard() {
        if (contentArea != null) {
            contentArea.getChildren().clear();
            contentArea.getChildren().add(new DashboardView());
        }
    }
    
    public static void showHome() {
        if (contentArea != null) {
            contentArea.getChildren().clear();
            contentArea.getChildren().add(new HomeView());
        }
    }
}
