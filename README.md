# Deploy API to Google Cloud "AppEngine":
- add app.yml in src/main/appengine
- mvn clean package appengine:deploy
- gcloud app logs tail -s default (get logs)
- gcloud app browse - https://projectfj.ew.r.appspot.com/hello // gcloud app deploy
