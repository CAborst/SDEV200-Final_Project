package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class Main extends Application {
    
	@Override
    public void start(Stage primaryStage) {
        try {
            BorderPane mainRoot = new BorderPane();
            Stage coursesStage = new Stage();
            BorderPane coursesRoot = new BorderPane();

            // Create a label for the main menu.
            Label mainMenuLabel = new Label("Main Menu");
            mainMenuLabel.setFont(new Font("Arial", 30));

            // Create a button to go to the Enter New Course pane.
            Button enterNewCourseButton = new Button("Enter New Course");
            enterNewCourseButton.setOnAction(new EventHandler<ActionEvent>() {
            	
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Enter New Course button clicked.");
                    coursesStage.setScene(new Scene(coursesRoot, 400, 400));
                    coursesStage.show();
                }
            });

            // Create a button to quit the application.
            Button quitButton = new Button("Quit");
            quitButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    primaryStage.close();
                }
            });

            // Add the label and buttons to the root pane.
            mainRoot.setTop(mainMenuLabel);
            mainRoot.setCenter(enterNewCourseButton);
            mainRoot.setBottom(quitButton);

            Scene mainScene = new Scene(mainRoot, 400, 400);
            
            mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(mainScene);
            primaryStage.show();
            
            // Courses scene
            
            // Create a headline label.
            Label headline = new Label("Enter New Course");
            headline.setFont(new Font("Arial", 30));

            // Create a headline label.
            Label courseDescriptionLabel = new Label("Course Description");
            courseDescriptionLabel.setFont(new Font("Arial", 16));

            BorderPane descriptionPane = new BorderPane();
            BorderPane courseFeePane = new BorderPane();
            BorderPane courseNamePane = new BorderPane();
            BorderPane fieldsContainerPane = new BorderPane();
            BorderPane buttonPane = new BorderPane();
            BorderPane instructorPane = new BorderPane();
            
            Label descriptionLabel = new Label("courseFee");
            descriptionLabel.setFont(new Font("Arial", 16));
            
            // Create a text area for the description with a prompt text of "Course Description".
            TextArea description = new TextArea();
            description.setPrefHeight(200);
            description.setPromptText("Course Description");

            Label courseFeeLabel = new Label("Base Fee");
            courseFeeLabel.setFont(new Font("Arial", 16));
            
            Label courseNameLabel = new Label("Course Name");
            courseNameLabel.setFont(new Font("Arial", 16));

            // Create a text field for the courseFee with a prompt text of "courseFee".
            TextField courseFee = new TextField();
            courseFee.setPrefWidth(100);
            courseFee.setPromptText("Base Fee");

            TextField courseName = new TextField();
            courseName.setPromptText("Course Name" );
            
            Button submitButton = new Button("Submit");
            Button cancelButton = new Button("Cancel");
            
            TextField instructorName = new TextField();
            instructorName.setPromptText("Instructor Name");
            Label instructorNameLabel = new Label("Instructor Name");
            instructorNameLabel.setFont(new Font("Arial", 16));
            
  
            // Create a new EventHandler<ActionEvent> object.
            EventHandler<ActionEvent> submitButtonEventHandler = new EventHandler<ActionEvent>() {
            	@Override
            	public void handle(ActionEvent event) {
            	    System.out.println("The submit button was clicked.");

            	    if (courseName.getText().isEmpty()) {
            	        Alert alert = new Alert(Alert.AlertType.ERROR);
            	        alert.setTitle("Error");
            	        alert.setHeaderText("Please enter a course name.");
            	        alert.setContentText("The course name field cannot be blank.");
            	        alert.showAndWait();
            	        return;
            	    }

            	    if (description.getText().isEmpty()) {
            	        Alert alert = new Alert(Alert.AlertType.ERROR);
            	        alert.setTitle("Error");
            	        alert.setHeaderText("Please enter a course description.");
            	        alert.setContentText("The course description field cannot be blank.");
            	        alert.showAndWait();
            	        return;
            	    }

            	    if (courseFee.getText().isEmpty()) {
            	        Alert alert = new Alert(Alert.AlertType.ERROR);
            	        alert.setTitle("Error");
            	        alert.setHeaderText("Please enter a course fee.");
            	        alert.setContentText("The course fee field cannot be blank.");
            	        alert.showAndWait();
            	        return;
            	    }

            	    try {
            	        double fee = Double.parseDouble(courseFee.getText());
            	        if (fee > 500.00) {
            	            Alert alert = new Alert(Alert.AlertType.ERROR);
            	            alert.setTitle("Error");
            	            alert.setHeaderText("Course fee must be less than $500.00");
            	            alert.setContentText("The course fee cannot be greater than $500.00");
            	            alert.showAndWait();
            	            return;
            	        }

            	        if (fee < 0.00) {
            	            Alert alert = new Alert(Alert.AlertType.ERROR);
            	            alert.setTitle("Error");
            	            alert.setHeaderText("Course fee must be greater than $0.00");
            	            alert.setContentText("The course fee cannot be less than $0.00");
            	            alert.showAndWait();
            	            return;
            	        }
            	    } catch (NumberFormatException e) {
            	        Alert alert = new Alert(Alert.AlertType.ERROR);
            	        alert.setTitle("Error");
            	        alert.setHeaderText("Course fee must be a monetary value.");
            	        alert.setContentText("The course fee field must contain a monetary value without a dollar sign.");
            	        alert.showAndWait();
            	        return;
            	    }

            	    Courses courses = new Courses(courseName.getText(), description.getText(), 
            	    					Double.parseDouble(courseFee.getText()), instructorName.getText());
            	    System.out.println(courses);
                    coursesStage.close();
                    
                 // Create a new Scene object with the mainRoot object as its root.
                    Scene mainScene = new Scene(mainRoot, 400, 400);

                    // Set the scene for the primaryStage object to the new Scene object.
                    primaryStage.setScene(mainScene);
                    primaryStage.show();
            	}
            };
            
            // Create a new EventHandler<ActionEvent> object.
            EventHandler<ActionEvent> cancelButtonEventHandler = new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("The cancel button was clicked.");
                    coursesStage.close();

                    primaryStage.setScene(new Scene(mainRoot, 400, 400));
                    primaryStage.show();
                }
            };

            // Set the action of the button to the eventHandler object.
            submitButton.setOnAction(submitButtonEventHandler);
            cancelButton.setOnAction(cancelButtonEventHandler);
            
            // Add the headline, description, and courseFee to the root pane.
            coursesRoot.setTop(headline);
            coursesRoot.setCenter(fieldsContainerPane);
            coursesRoot.setBottom(buttonPane);
            
            fieldsContainerPane.setTop(courseNamePane);
            fieldsContainerPane.setCenter(descriptionPane);
            fieldsContainerPane.setBottom(courseFeePane);
            
            // Add the labels and text fields to the descriptionPane and courseFeePane objects.
            courseNamePane.setTop(courseNameLabel);
            courseNamePane.setCenter(courseName);
            descriptionPane.setTop(courseDescriptionLabel);
            descriptionPane.setCenter(description);
            descriptionPane.setBottom(instructorPane);
            courseFeePane.setTop(courseFeeLabel);
            courseFeePane.setCenter(courseFee);
            buttonPane.setLeft(submitButton);
            buttonPane.setRight(cancelButton);
            instructorPane.setTop(instructorNameLabel);
            instructorPane.setBottom(instructorName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
