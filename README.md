# SwuCholarShip

<div align="center">
  <img src="assets/로고.jpg" alt="SwuCholarShip Logo" width="300"/>
  
  **Know everything about scholarships**
</div>

A comprehensive scholarship information management Android application developed by Seoul Women's University students. The goal is to help students not miss scholarship application opportunities.

## Project Overview

SwuCholarShip is an innovative scholarship information centralization application for university students. It helps students easily find and share scholarship information without individual searching, ensuring they never miss scholarship application deadlines.

> **Our Mission**: *"Our goal is for this to become an app that helps not only Seoul Women's University students but also many university students to share information without having to search for it individually, and to apply for scholarships without missing out..."*

## Problem We Solve

<div align="center">
  <img src="assets/아이디어 동기.jpg" alt="Idea Motivation" width="600"/>
</div>

- **Information Scattered**: Numerous scholarships exist but information is hard to find
- **Missed Opportunities**: Students often miss application deadlines due to lack of awareness
- **Time-Consuming Search**: Individual research for each scholarship is time-consuming
- **No Centralized Platform**: No single platform to manage all scholarship information

**Our Solution**: A centralized platform that shows hidden scholarships at a glance and motivates students to apply without missing out.
<br/><br/>

## Key Features

<div align="center">
  <img src="assets/요약_주요기능소개.jpg" alt="Key Features Overview" width="600"/>
</div>
<br/>

### 🏠 Main Home
<div align="center">
  <img src="assets/기능소개_메인홈.jpg" alt="Main Home Feature" width="500"/>
</div>

- **Calendar Format**: Intuitive calendar format for scholarship information display
- **Smart Recommendations**: Personalized scholarship suggestions with hashtag filtering
- **Quick Access**: Easy navigation through scholarship categories
<br/>

### 🔔 Alarm System
<div align="center">
  <img src="assets/기능소개_알림.jpg" alt="Alarm Feature" width="500"/>
</div>

- **Deadline Tracking**: Application deadline notifications with countdown timers
- **Visual Indicators**: Color-coded alerts (Green: Safe, Yellow: Warning, Red: Urgent)
- **Auto-Sorting**: Alarms sorted by urgency for easy priority management
<br/>

### ⭐ Favorites
<div align="center">
  <img src="assets/기능소개_즐겨찾기.jpg" alt="Favorites Feature" width="500"/>
</div>

- **Bookmark System**: Save scholarships of interest for easy access
- **Color Coding**: Internal scholarships (navy blue), External scholarships (yellow)
- **Quick Management**: Easy add/remove with confirmation dialogs
<br/>

### 🧮 Tuition Calculator
<div align="center">
  <img src="assets/기능소개_my장학.jpg" alt="Tuition Calculator Feature" width="500"/>
</div>

- **Smart Calculation**: Automatically calculate remaining tuition after scholarships
- **Profile Integration**: Uses registered department and grade information
- **Real-time Updates**: Shows current bookmarked scholarship amounts
<br/><br/>

## Additional Features

<div align="center">
  <img src="assets/요약_부가기능소개.jpg" alt="Additional Features Overview" width="600"/>
</div>

### 🔍 Search
- **Keyword Search**: Quick and easy scholarship search functionality
- **Advanced Filters**: Multiple search criteria for precise results

### 📖 Coach Mark
- **User Guidance**: Simple user manual with interactive tutorials
- **Feature Discovery**: Help users understand app functionality
<br/><br/>

## App Usage Flow

### Login and Registration
<div align="center">
  <img src="assets/기능 소개_로그인.jpg" alt="Login and Registration" width="500"/>
</div>

### Overall User Flow
<div align="center">
  <img src="assets/기능소개_전체적인 흐름.jpg" alt="Overall User Flow" width="600"/>
</div>
<br/><br/>

## Technical Details

### Architecture
- **Language**: Kotlin
- **UI Framework**: Android native with Material Design
- **Architecture Pattern**: Fragment-based navigation with ViewPager2

### Key Components
- **Main Activity**: `ToolActivity` - Handles navigation and fragment management
- **Fragments**: 
  - Bottom navigation fragments (Home, Info, Alarm, MyPage, Star)
  - Drawer navigation fragments (Inside, Outside, Nation)
- **Navigation**: DrawerLayout + BottomNavigationView + ViewPager2

### Dependencies
- **AndroidX Libraries**: Core, AppCompat, Material Design, ConstraintLayout
- **Fragment Support**: Fragment-ktx for enhanced fragment handling
- **Navigation**: Material Design navigation components
<br/><br/>

## Project Structure

```
app/
├── src/main/
│   ├── java/com/example/swucholars_imclude_bttombar02/
│   │   ├── ToolActivity.kt                    # Main activity
│   │   ├── Adapter/
│   │   │   └── DrawerFragmentStatePagerAdapter.kt
│   │   ├── fragment_bottombar/               # Bottom navigation fragments
│   │   │   ├── HomeFragment.kt
│   │   │   ├── InfoFragment.kt
│   │   │   ├── AlarmFragment.kt
│   │   │   ├── MypageFragment.kt
│   │   │   └── StarFragment.kt
│   │   └── fragment_drawer/                  # Drawer navigation fragments
│   │       ├── InsideFragment.kt
│   │       ├── OutsideFragment.kt
│   │       └── NationFragment.kt
│   ├── res/
│   │   ├── layout/                           # UI layouts
│   │   ├── menu/                             # Navigation menus
│   │   ├── drawable/                         # Icons and images
│   │   └── values/                           # Strings, colors, themes
│   └── AndroidManifest.xml
└── build.gradle
```
<br/><br/>

## Setup and Installation

### Prerequisites
- Android Studio Arctic Fox or later
- Android SDK API level 30
- Minimum SDK version 24 (Android 7.0)

### Build Instructions
1. Clone the repository
2. Open the project in Android Studio
3. Sync the project with Gradle files
4. Build and run the application

### Gradle Configuration
```gradle
android {
    compileSdkVersion 30
    buildToolsVersion "30.0.0"
    
    defaultConfig {
        applicationId 'com.example.swucholars_imclude_bttombar02'
        minSdkVersion 24
        targetSdkVersion 30
        versionCode 1
        versionName "1.0"
    }
}
```
<br/><br/>

## Development Notes

- The app uses a single activity architecture with multiple fragments
- ViewPager2 is used for smooth fragment transitions
- Material Design components are used throughout the UI
- Custom fonts (WeMakePrice) are applied for consistent branding
<br/><br/>

## Version Information

- **Version**: 1.0
- **Build**: Release build configuration available
- **Target SDK**: Android API 30
- **Minimum SDK**: Android API 24
<br/><br/>

## Expected Impact

<div align="center">
  <img src="assets/마무리 멘트_기대효과.jpg" alt="Expected Impact" width="600"/>
</div>
<br/><br/>

## Development Team

<div align="center">

**박재이 & 박혜정 & 이수진 & 최현지**

*Development Team Members*

</div>
<br/><br/>

## Citation & Usage Notice

**Citation**: If you use this project in your research or academic work, please cite this repository and acknowledge the original authors.

### Academic Use
For academic or research purposes:
- Please acknowledge the original authors
- Cite this repository if used as a reference
- Contact the development team for collaboration opportunities

### License Notice
This project is developed by Seoul Women's University students. Please respect intellectual property rights and use responsibly.
