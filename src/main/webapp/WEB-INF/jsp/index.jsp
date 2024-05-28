<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-200 text-center">
    <nav class="bg-blue-500 p-4">
        <div class="container mx-auto">
            <a href="/" class="text-white text-lg font-bold">Home</a>
            <a href="/about" class="text-white text-lg ml-4">About</a>
        </div>
    </nav>
    <h1 class="text-4xl font-bold my-4">Welcome page</h1>
    <h2 class="text-3xl my-2" th:text="${intestazione}"></h2>
    <h3 class="text-2xl my-2" th:text="${saluti}"></h3>
</body>
</html>