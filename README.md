# Crypto Currency App

A real-time cryptocurrency price tracker built with Clean Architecture and Jetpack Compose.

## 📱 App Overview

Browse live cryptocurrency prices, view detailed coin information, and track market trends — all with a clean, reactive UI powered by Jetpack Compose.

## 🛠 Tech Stack

| Technology | Purpose |
|-----------|---------|
| Kotlin | Primary language |
| Jetpack Compose | Declarative UI |
| Retrofit + OkHttp | REST API networking |
| Kotlin Coroutines + Flow | Async data streams |
| Hilt | Dependency injection |
| Jetpack Navigation | In-app navigation |
| MVVM Clean Architecture | App architecture |
| Material3 | Design system |

## 🏗 Architecture

```
Presentation (Compose + ViewModel)
        ↑
    Domain (Use Cases)
        ↑
    Data (Repository → Retrofit API)
```

## 🚀 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/santhoshj001/Crypto-Currency-App.git
   ```
2. Open in **Android Studio**
3. Let Gradle sync (uses public CoinGecko API — no key required)
4. Run on an emulator or device (API 21+)

## 📄 License

MIT — see [LICENSE](LICENSE)
