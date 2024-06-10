# Daikichi Application

The Daikichi Application is a simple Spring Boot application that provides motivational messages through a REST API. This application has endpoints that return different messages for the current day and the following day.

## Endpoints

- `GET /daikichi` - Returns a welcome message.
- `GET /daikichi/today` - Returns a message for today.
- `GET /daikichi/tomorrow` - Returns a message for tomorrow.

## Example Usage

- Access the welcome message:

    ```sh
    curl http://localhost:8080/daikichi
    ```

    Response:

    ```
    Welcome!
    ```

- Access today's message:

    ```sh
    curl http://localhost:8080/daikichi/today
    ```

    Response:

    ```
    Today you will find luck in all your endeavors!
    ```

- Access tomorrow's message:

    ```sh
    curl http://localhost:8080/daikichi/tomorrow
    ```

    Response:

    ```
    Tomorrow, an opportunity will arise, so be sure to be open to new ideas!
    ```
