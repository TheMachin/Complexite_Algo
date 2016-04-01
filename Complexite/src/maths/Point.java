    package maths;

    //=====================================================
    //=====================================================
    //                  CLASSE POINT
    //=====================================================
    //=====================================================

    /* classe qui permet de construire un point du segment*/

    public class Point {

        /*--déclarations des variables--*/
        private float x;
        private float y;


        /*--constructeur--*/
        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        /*--accesseurs--*/
        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }


        @Override
        public String toString(){
            return this.x+" , "+this.y;
        }




    }
