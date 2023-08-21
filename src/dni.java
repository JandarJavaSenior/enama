public enum dni {
        MONDAY("Дуйшөмбү куну жава окуйм"),
        TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
        WEDNESDAY("Шаршемби күнү кыргыз тили сабагын окуйм"),
        THURSDAY("Бейшемби күнү рус тили сабагын окуйм"),
        FRIDAY("Жума күнү математика сабагын окуйм"),
        SATURDAY("Ишемби күнү физика сабагын окуйм"),
        SUNDAY("Жекшемби күнү биология сабагын окуйм");

        private final String lesson;

        dni (String lesson) {
            this.lesson = lesson;
        }

        public String getLesson() {
            return lesson;
        }

}
