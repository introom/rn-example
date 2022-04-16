install-deps:
	@npm install
	@npx pod-install ios

run-shadow:
	@npx shadow-cljs watch app

run-metro:
	@npx react-native start

run-android:
	@npx react-native run-android 

run-ios:
	@npx react-native run-ios